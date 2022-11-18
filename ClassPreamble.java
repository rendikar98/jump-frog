import java.lang.annotation.Documented;

@Documented
public @interface ClassPreamble {
    String author();
    String date();
    String currentRevision();
    String lastModified();
    String lastModifiedBy();
    String reviewers();
}
