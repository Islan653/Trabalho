package runner;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features") // isso deve estar em src/test/resources/features
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "steps")
// Se quiser rodar todos os cenários, deixe sem filtro
//@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@login")
public class TestRunner {}


