package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/***
 * By default the scope is Singleton. So, everytime the same object will be injected.
 * Prototype scope means every time new object will be created.
 * Check about all the scopes and spring bean lifecycle.
 */
@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {
    private String qualification;

    public void assist() {
        System.out.println("Doctor assisting...");
    }

    public java.lang.String getQualification() {
        return qualification;
    }

    public void setQualification(java.lang.String qualification) {
        this.qualification = qualification;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Doctor{" +
                "qualification=" + qualification + "  " + this.hashCode() +
                '}';
    }

    @java.lang.Override
    public void setBeanName(java.lang.String s) {
        System.out.println("setBeanName called");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Post Construct method is called");
    }
}
