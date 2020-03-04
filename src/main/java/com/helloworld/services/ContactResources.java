package com.helloworld.services;

import com.helloworld.grpcservices.ContactServiceGrpc;
import com.helloworld.model.Contact;
import com.helloworld.modelproto.ContactId;
import com.helloworld.modelproto.ContactProto;
import com.helloworld.modelproto.Response;
import io.grpc.stub.StreamObserver;
import java.io.File;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author karunam.goyal
 * @project gRPC_POC
 */
public class ContactResources extends ContactServiceGrpc.ContactServiceImplBase
{

    SessionFactory sessionFactory;
    Session session;
    public ContactResources()
    {
        sessionFactory =
                new Configuration().configure(new File("src/main/java/com/helloworld/services/hibernate.cfg.xml"))
                        .addAnnotatedClass(Contact.class)
                        .buildSessionFactory();


    }

    @Override
    public void createContact(ContactProto request, StreamObserver<Response> responseObserver)
    {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Response response;
        try
        {
            Contact contact =
                    new Contact(request.getId(), request.getFirstName(), request.getLastName(), request.getPhone());
            session.save(contact);
            response = Response.newBuilder().setId(contact.getId()).setMessage("Success").setSTATUS(201).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();

        }
        catch (Exception e)
        {
            response = Response.newBuilder().setMessage("Fail").setSTATUS(400).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        session.getTransaction().commit();
        //sessionFactory.close();

    }

    @Override
    public void getContact(ContactId request, StreamObserver<ContactProto> responseObserver)
    {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Contact contact = session.get(Contact.class, request.getId());
        ContactProto contactProto = ContactProto.newBuilder()
                .setId(contact.getId())
                .setFirstName(contact.getFirstName())
                .setLastName(contact.getLastName())
                .setPhone(contact.getPhone())
                .build();
        responseObserver.onNext(contactProto);
        responseObserver.onCompleted();
        session.getTransaction().commit();
        //sessionFactory.close();
    }

    @Override
    public void updateContact(ContactProto request, StreamObserver<Response> responseObserver)
    {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Response response;
        try
        {
            Contact contact = session.get(Contact.class, request.getId());
            contact.setPhone(request.getPhone());
            contact.setLastName(request.getLastName());
            contact.setFirstName(request.getFirstName());
            session.update(contact);

            response = Response.newBuilder().setMessage("Success").setSTATUS(200).setId(contact.getId()).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        catch (Exception i)
        {
            response = Response.newBuilder().setMessage("Fail").setSTATUS(400).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        session.getTransaction().commit();
        //sessionFactory.close();

    }

    @Override
    public void deleteContact(ContactId request, StreamObserver<Response> responseObserver)
    {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Response response;
        try
        {
            Contact contact = session.get(Contact.class, request.getId());
            session.remove(contact);

            response = Response.newBuilder().setMessage("Success").setSTATUS(200).setId(contact.getId()).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        catch (Exception e)
        {
            response = Response.newBuilder().setMessage("Fail").setSTATUS(400).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        session.getTransaction().commit();
        //essionFactory.close();

    }
}
