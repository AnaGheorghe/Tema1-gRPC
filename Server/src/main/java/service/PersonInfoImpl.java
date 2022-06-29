package service;

import io.grpc.stub.StreamObserver;
import proto.Person;
import proto.PersonInfoGrpc;

import java.time.LocalDate;
import java.time.Period;

public class PersonInfoImpl extends PersonInfoGrpc.PersonInfoImplBase {
    @Override
    public void getPersonInfo(Person.PersonRequest request, StreamObserver<Person.InfoReply> responseObserver) {
        char gender;
        int age;
        LocalDate birthdate;
        int year;
        int month;
        int day;
        Period differenceDate;
        LocalDate currentDate=LocalDate.now();
        if(request.getCnp().charAt(0)=='1' || request.getCnp().charAt(0)=='5'){
            gender='M';
        }
        else{
            gender='F';
        }

        if(request.getCnp().charAt(0)=='1' || request.getCnp().charAt(0)=='2'){
            year=1900+Integer.valueOf(request.getCnp().substring(1,3));
        }
        else{
            year=2000+Integer.valueOf(request.getCnp().substring(1,3));
        }
        month=Integer.valueOf(request.getCnp().substring(3,5));
        day=Integer.valueOf(request.getCnp().substring(5,7));
        birthdate=LocalDate.of(year, month, day);
        differenceDate= Period.between(birthdate,currentDate);
        age=differenceDate.getYears();

        Person.InfoReply reply=Person.InfoReply.newBuilder().setMessage("Name: " +request.getName()+ "  CNP: "+ request.getCnp()+ "  Gender: "+gender+"  Age: "+age).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
        System.out.println(reply.getMessage());
    }
}