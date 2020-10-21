import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.*;

public class CustomVisitor extends ASTVisitor {
    List<PackageDeclaration> packageDeclarations = new ArrayList<>();
    List<SingleMemberAnnotation> singleMemberAnnotations = new ArrayList<>();
    List<MethodDeclaration> methodDeclarations = new ArrayList<>();
    List<MethodInvocation> methodInvocations = new ArrayList<>();


    @Override
    public boolean visit(PackageDeclaration node) {
        packageDeclarations.add(node);
        return super.visit(node);
    }

    @Override
    public boolean visit(SingleMemberAnnotation node) {
        singleMemberAnnotations.add(node);
        return true;
    }

    @Override
    public boolean visit(MethodDeclaration node) {
        methodDeclarations.add(node);
        return super.visit(node);
    }

    @Override
    public boolean visit(MethodInvocation node) {
        methodInvocations.add(node);
        return super.visit(node);
    }

    public List<PackageDeclaration> getPackageDeclarations() {
        return packageDeclarations;
    }

    public List<SingleMemberAnnotation> getSingleMemberAnnotations() {
        return singleMemberAnnotations;
    }

    public List<MethodDeclaration> getMethodDeclarations() {
        return methodDeclarations;
    }

    public List<MethodInvocation> getMethodInvocations() {
        return methodInvocations;
    }
}