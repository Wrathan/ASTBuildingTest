import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ModuleDeclaration;
import org.eclipse.jdt.core.dom.PackageDeclaration;

import java.awt.*;

public class NodeInfo {
    private final Point startPosition;
    private final Point endPosition;
    private final PackageDeclaration packageDeclaration;

    public NodeInfo(CompilationUnit cu, ASTNode node) {
        int endPosition = node.getStartPosition() + node.getLength();

        this.packageDeclaration = cu.getPackage();
        this.startPosition = new Point(cu.getLineNumber(node.getStartPosition()), cu.getColumnNumber(node.getStartPosition()));
        this.endPosition = new Point(cu.getLineNumber(endPosition), cu.getColumnNumber(endPosition));
    }

    public Point getStartPosition() {
        return startPosition;
    }

    public Point getEndPosition() {
        return endPosition;
    }

    public PackageDeclaration getPackageDeclaration() {
        return packageDeclaration;
    }
}