import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        service.fetchData();

        // Check interaction
        try {
            verify(mockApi).getData();
            System.out.println("getData() was called");
            System.out.println("Test Passed: getData() was called.");
        } catch (AssertionError e) {
            System.out.println("Test Failed: getData() was NOT called.");
            throw e; // rethrow to mark test as failed
        }
    }
}
