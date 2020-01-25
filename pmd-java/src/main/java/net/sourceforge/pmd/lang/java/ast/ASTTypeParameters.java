/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.java.ast;


import java.util.Iterator;

import net.sourceforge.pmd.annotation.InternalApi;


/**
 * Represents a list of type parameters.
 *
 * <pre>
 *
 * TypeParameters ::= "<" {@linkplain ASTTypeParameter TypeParameter} ( "," {@linkplain ASTTypeParameter TypeParameter} )* ">"
 *
 * </pre>
 */
public class ASTTypeParameters extends AbstractJavaNode implements Iterable<ASTTypeParameter> {

    @InternalApi
    @Deprecated
    public ASTTypeParameters(int id) {
        super(id);
    }

    @InternalApi
    @Deprecated
    public ASTTypeParameters(JavaParser p, int id) {
        super(p, id);
    }

    @Override
    public Object jjtAccept(JavaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }


    @Override
    public <T> void jjtAccept(SideEffectingVisitor<T> visitor, T data) {
        visitor.visit(this, data);
    }


    @Override
    public Iterator<ASTTypeParameter> iterator() {
        return children(ASTTypeParameter.class).iterator();
    }
}