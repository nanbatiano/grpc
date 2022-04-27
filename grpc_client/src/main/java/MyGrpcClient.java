import com.example.grpc.HelloRequest;
import com.example.grpc.HelloResponse;
import com.example.grpc.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
public class MyGrpcClient {
    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8082)
                .usePlaintext()
                .build();
        HelloServiceGrpc.HelloServiceBlockingStub stub =
                HelloServiceGrpc.newBlockingStub(channel);
        HelloResponse helloResponse = stub.hello(
                HelloRequest.newBuilder()
                        .setName("shenpengpeng")
                        .setAge(28155)
                        .addHobbies("football master dev121")
                        .putTags( "how?","wonderful" )
                        .build());
        System.out.println(helloResponse);
        channel.shutdown();
    }
}