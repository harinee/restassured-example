import org.testng.annotations.Test;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.MatcherAssert.assertThat;

public class firstTest {


    @Test public void
    validates_schema_in_classpath() {
        // Given
        String json = ... // Greeting response

        // Then
        assertThat(json, matchesJsonSchemaInClasspath("greeting-schema.json"));
    }
}