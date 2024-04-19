package demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/***
 * By default the scope is Singleton. So, everytime the same object will be injected.
 * Prototype scope means every time new object will be created.
 * Check about all the scopes and spring bean lifecycle.
 */
@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff {
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
                "qualification=" + qualification+"  " + this.hashCode()+
                '}';
    }
}
