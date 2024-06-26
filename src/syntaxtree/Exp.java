//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> Exp_simple()
 * f1 -> ( Op_comp() Exp_simple() )?
 */
public class Exp implements Node {
   public Exp_simple f0;
   public NodeOptional f1;

   public Exp(Exp_simple n0, NodeOptional n1) {
      f0 = n0;
      f1 = n1;
   }

   public void accept(visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

