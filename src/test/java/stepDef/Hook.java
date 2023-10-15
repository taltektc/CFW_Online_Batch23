package stepDef;

import base.Config;
import io.cucumber.java.Before;

public class Hook extends Config {
    // all 3 env (QA | STAGE | PROD)
    // Browser (chrome | firefox | safari)
    public static String envType = System.getProperty("env");
    public static String browserType = System.getProperty("browser");
    public static String baseURL;

    @Before
    public void startTest(){
        driver = setupBrowser(browserType);
        switch (envType){
            case "qa":
                baseURL = "https://qa.taltektc.com";
                GLOBAL_STUDENT_EMAIL = "qa_env_test@gmail.com";
                GLOBAL_STUDENT_PASSWORD = "qaPassword1";
                break;
            case "stage":
                baseURL = "https://stage.taltektc.com";
                GLOBAL_STUDENT_EMAIL = "stage_env_test@gmail.com";
                GLOBAL_STUDENT_PASSWORD = "stagePass1";
                break;
            case "prod":
                baseURL = "https://prod.taltektc.com";
                break;
        }
        driver.get(baseURL);

    }
}
