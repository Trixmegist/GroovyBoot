package demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.inject.Inject;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication public class DemoApplication {
    @Inject String foo;
    @Inject String bar;

    public static void main(String[] args) {
        DemoApplication app = run(new Object[] {DemoApplication.class, "config.groovy"}, args)
            .getBean(DemoApplication.class);
        System.out.print(app.sayFooBar());
    }

    private String sayFooBar() {
        return foo + " " + bar;
    }
}
