import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import proto.PersonInfoGrpc;
import proto.Person;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name=scanner.next();
        System.out.println("Enter CNP: ");
        String CNP=scanner.next();

        int option=1;

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8999).usePlaintext().build();

        PersonInfoGrpc.PersonInfoBlockingStub personStub = PersonInfoGrpc.newBlockingStub(channel);

        Person.InfoReply reply = personStub.getPersonInfo(Person.PersonRequest.newBuilder().setName(name).setCnp(CNP).build());
        System.out.println(reply);

        System.out.println("If you want to close the current client, insert 0!");
        while(option!=0)
        {
            System.out.print("Input: ");
            option=scanner.nextInt();
        }

        channel.shutdown();
        scanner.close();



    }
}
