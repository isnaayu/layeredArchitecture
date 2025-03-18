package isnaayum.co.id.myproject.util;

import org.springframework.beans.factory.annotation.Value;

public class ArchitectureConstants {
//    Suffixes
    public static final String CONTROLLER_SUFFIX = "Controller";
    public static final String REPOSITORY_SUFFIX = "Repository";
    public static final String SERVICE_SUFFIX = "Service";
    public static final String IMPL_SUFFIX = "Impl";

//    Packages
    public static final String CONTROLLER_PACKAGE = "..controller..";
    public static final String REPOSITORY_PACKAGE = "..repository..";
    public static final String SERVICE_PACKAGE = "..service..";
    public static final String IMPL_SERVICE_PACKAGE = "..service.impl..";
    public static final String DTO_PACKAGE = "..dto..";
    public static final String DOMAIN_PACKAGE = "..domain..";

//    package to scan
    public static final String DEFAULT_PACKAGE = "isnaayum.co.id.myproject";


    public static final String ANNOTATED_EXPLANATION = "Classes in %s package should be annotated with %s";
}
