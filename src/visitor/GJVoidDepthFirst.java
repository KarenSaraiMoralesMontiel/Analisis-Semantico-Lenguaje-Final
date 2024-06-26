//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * Provides default methods which visit each node in the tree in depth-first
 * order.  Your visitors may extend this class.
 */
public class GJVoidDepthFirst<A> implements GJVoidVisitor<A> {
   //
   // Auto class visitors--probably don't need to be overridden.
   //
   public void visit(NodeList n, A argu) {
      int _count=0;
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
         e.nextElement().accept(this,argu);
         _count++;
      }
   }

   public void visit(NodeListOptional n, A argu) {
      if ( n.present() ) {
         int _count=0;
         for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
            e.nextElement().accept(this,argu);
            _count++;
         }
      }
   }

   public void visit(NodeOptional n, A argu) {
      if ( n.present() )
         n.node.accept(this,argu);
   }

   public void visit(NodeSequence n, A argu) {
      int _count=0;
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
         e.nextElement().accept(this,argu);
         _count++;
      }
   }

   public void visit(NodeToken n, A argu) {}

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> ( Sentencia() )*
    */
   public void visit(SentenciaMuchas n, A argu) {
      n.f0.accept(this, argu);
   }

   /**
    * f0 -> Declaracion() ";"
    *       | Sent_read() ";"
    *       | Sent_write() ";"
    *       | Asignacion() ";"
    *       | While()
    *       | For()
    *       | SentenciaIf()
    */
   public void visit(Sentencia n, A argu) {
      n.f0.accept(this, argu);
   }

   /**
    * f0 -> "while"
    * f1 -> "("
    * f2 -> Comparison()
    * f3 -> ")"
    * f4 -> "{"
    * f5 -> SentenciaMuchas()
    * f6 -> "}"
    */
   public void visit(While n, A argu) {
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      n.f5.accept(this, argu);
      n.f6.accept(this, argu);
   }

   /**
    * f0 -> "for"
    * f1 -> "("
    * f2 -> <VAR>
    * f3 -> ")"
    * f4 -> "in"
    * f5 -> "range"
    * f6 -> "("
    * f7 -> ( <INTEGER> | <VAR> )
    * f8 -> ")"
    * f9 -> "{"
    * f10 -> SentenciaMuchas()
    * f11 -> "}"
    */
   public void visit(For n, A argu) {
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      n.f5.accept(this, argu);
      n.f6.accept(this, argu);
      n.f7.accept(this, argu);
      n.f8.accept(this, argu);
      n.f9.accept(this, argu);
      n.f10.accept(this, argu);
      n.f11.accept(this, argu);
   }

   /**
    * f0 -> "if"
    * f1 -> "("
    * f2 -> Comparison()
    * f3 -> ")"
    * f4 -> "{"
    * f5 -> ( Sentencia() )+
    * f6 -> "}"
    * f7 -> ( "else" "{" SentenciaMuchas() "}" )?
    */
   public void visit(SentenciaIf n, A argu) {
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      n.f5.accept(this, argu);
      n.f6.accept(this, argu);
      n.f7.accept(this, argu);
   }

   /**
    * f0 -> ( Op_Not() )?
    * f1 -> Exp()
    * f2 -> ( ( ( Op_Not() | Op_OrAnd() ) Exp() )+ )?
    */
   public void visit(Comparison n, A argu) {
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
   }

   /**
    * f0 -> "!"
    */
   public void visit(Op_Not n, A argu) {
      n.f0.accept(this, argu);
   }

   /**
    * f0 -> "|"
    *       | "&&"
    */
   public void visit(Op_OrAnd n, A argu) {
      n.f0.accept(this, argu);
   }

   /**
    * f0 -> Tipo()
    * f1 -> <VAR>
    */
   public void visit(Declaracion n, A argu) {
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
   }

   /**
    * f0 -> "int"
    *       | "String"
    *       | "float"
    */
   public void visit(Tipo n, A argu) {
      n.f0.accept(this, argu);
   }

   /**
    * f0 -> "enter"
    * f1 -> "("
    * f2 -> <VAR>
    * f3 -> ")"
    */
   public void visit(Sent_read n, A argu) {
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
   }

   /**
    * f0 -> "print"
    * f1 -> "("
    * f2 -> ( Exp() | <CADENA> )
    * f3 -> ")"
    */
   public void visit(Sent_write n, A argu) {
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
   }

   /**
    * f0 -> <VAR>
    * f1 -> "="
    * f2 -> ( Exp() | <CADENA> )
    */
   public void visit(Asignacion n, A argu) {
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
   }

   /**
    * f0 -> Exp_simple()
    * f1 -> ( Op_comp() Exp_simple() )?
    */
   public void visit(Exp n, A argu) {
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
   }

   /**
    * f0 -> "=="
    *       | "<"
    *       | ">"
    *       | "<="
    *       | ">="
    *       | "!="
    */
   public void visit(Op_comp n, A argu) {
      n.f0.accept(this, argu);
   }

   /**
    * f0 -> Term()
    * f1 -> ( ( Op_suma() | Op_resta() ) Term() )*
    */
   public void visit(Exp_simple n, A argu) {
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
   }

   /**
    * f0 -> "+"
    */
   public void visit(Op_suma n, A argu) {
      n.f0.accept(this, argu);
   }

   /**
    * f0 -> "-"
    */
   public void visit(Op_resta n, A argu) {
      n.f0.accept(this, argu);
   }

   /**
    * f0 -> Factor()
    * f1 -> ( Op_mult() Factor() )*
    */
   public void visit(Term n, A argu) {
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
   }

   /**
    * f0 -> "*"
    *       | "/"
    *       | "%"
    */
   public void visit(Op_mult n, A argu) {
      n.f0.accept(this, argu);
   }

   /**
    * f0 -> Factor2()
    * f1 -> ( Op_mod() Factor2() )*
    */
   public void visit(Factor n, A argu) {
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
   }

   /**
    * f0 -> "**"
    *       | "%%"
    */
   public void visit(Op_mod n, A argu) {
      n.f0.accept(this, argu);
   }

   /**
    * f0 -> "(" Exp() ")"
    *       | <INTEGER>
    *       | <FLOAT>
    *       | <VAR>
    */
   public void visit(Factor2 n, A argu) {
      n.f0.accept(this, argu);
   }

}
