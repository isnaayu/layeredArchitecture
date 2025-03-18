package isnaayum.co.id.myproject.architecture;

import com.tngtech.archunit.base.DescribedPredicate;
import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.*;
import static com.tngtech.archunit.library.dependencies.SlicesRuleDefinition.slices;
import static isnaayum.co.id.myproject.util.ArchitectureConstants.*;

@AnalyzeClasses(packages = DEFAULT_PACKAGE)
public class ArchitectureTests {

    private static final DescribedPredicate<JavaClass> anyServiceInterface = new DescribedPredicate<>("is a service interface") {
        @Override
        public boolean test(JavaClass javaClass) {
            return javaClass.getPackageName().contains("service") && javaClass.isInterface();
        }
    };

    @ArchTest
    static final ArchRule classesDomainShouldBeAnnotatedWithEntity = classes()
            .that()
            .resideInAnyPackage(DOMAIN_PACKAGE)
            .should().beAnnotatedWith(Entity.class)
            .andShould().beAnnotatedWith(Table.class);

    @ArchTest
    static final ArchRule repositoryShouldBeProperlyDefined = classes()
            .that().resideInAnyPackage(REPOSITORY_PACKAGE)
            .should().beInterfaces()
            .andShould().beAnnotatedWith(Repository.class)
            .andShould().haveSimpleNameEndingWith(REPOSITORY_SUFFIX);

    @ArchTest
    static final ArchRule noClassesOutsideServiceOrRepositoryShouldDependOnRepository = noClasses()
                    .that().resideOutsideOfPackages(SERVICE_PACKAGE, REPOSITORY_PACKAGE)
                    .should().dependOnClassesThat().resideInAnyPackage(REPOSITORY_PACKAGE);

    @ArchTest
    static final ArchRule serviceShouldBeProperlyDefined = classes()
            .that().resideInAPackage(SERVICE_PACKAGE)
            .and().resideOutsideOfPackage(IMPL_SERVICE_PACKAGE)
            .should().beInterfaces()
            .andShould().haveSimpleNameEndingWith(SERVICE_SUFFIX);

    @ArchTest
    static final ArchRule serviceImplementShouldBeProperlyDefinedAndImplement = classes()
            .that().resideInAnyPackage(IMPL_SERVICE_PACKAGE)
            .should().implement(anyServiceInterface)
            .andShould().beAnnotatedWith(Service.class)
            .andShould().haveSimpleNameEndingWith(IMPL_SUFFIX);

    @ArchTest
    static final ArchRule controllerShouldBeProperlyDefined = classes()
            .that().resideInAnyPackage(CONTROLLER_PACKAGE)
            .should().beAnnotatedWith(RestController.class)
            .andShould().haveSimpleNameEndingWith(CONTROLLER_SUFFIX)
            .andShould().haveOnlyFinalFields();

    @ArchTest
    static final ArchRule serviceShouldNotDependOnController = noClasses()
            .that().resideInAnyPackage(SERVICE_PACKAGE)
            .should().dependOnClassesThat().resideInAnyPackage(CONTROLLER_PACKAGE);

    @ArchTest
    static final ArchRule controllerShouldNotAccessRepository = noClasses()
            .that().resideInAnyPackage(CONTROLLER_PACKAGE)
            .should().dependOnClassesThat().resideInAnyPackage(REPOSITORY_PACKAGE);

    @ArchTest
    static final ArchRule serviceImplShouldBeConcreteClass = classes()
            .that().resideInAnyPackage(IMPL_SERVICE_PACKAGE)
            .should().beTopLevelClasses()
            .andShould().notBeInterfaces();

    @ArchTest
    static final ArchRule noCyclicDependencies = slices()
            .matching(DEFAULT_PACKAGE+".(*)")
            .should().beFreeOfCycles();









}

