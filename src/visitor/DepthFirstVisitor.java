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
public class DepthFirstVisitor implements Visitor {
   //
   // Auto class visitors--probably don't need to be overridden.
   //
   public void visit(NodeList n) {
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); )
         e.nextElement().accept(this);
   }

   public void visit(NodeListOptional n) {
      if ( n.present() )
         for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); )
            e.nextElement().accept(this);
   }

   public void visit(NodeOptional n) {
      if ( n.present() )
         n.node.accept(this);
   }

   public void visit(NodeSequence n) {
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); )
         e.nextElement().accept(this);
   }

   public void visit(NodeToken n) { }

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> ( Sentencia() )*
    */
   public void visit(SentenciaMuchas n) {
      n.f0.accept(this);
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
   public void visit(Sentencia n) {
      n.f0.accept(this);
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
   public void visit(While n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
      n.f6.accept(this);
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
   public void visit(For n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
      n.f6.accept(this);
      n.f7.accept(this);
      n.f8.accept(this);
      n.f9.accept(this);
      n.f10.accept(this);
      n.f11.accept(this);
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
   public void visit(SentenciaIf n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
      n.f6.accept(this);
      n.f7.accept(this);
   }

   /**
    * f0 -> ( Op_Not() )?
    * f1 -> Exp()
    * f2 -> ( ( ( Op_Not() | Op_OrAnd() ) Exp() )+ )?
    */
   public void visit(Comparison n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
   }

   /**
    * f0 -> "!"
    */
   public void visit(Op_Not n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> "|"
    *       | "&&"
    */
   public void visit(Op_OrAnd n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> Tipo()
    * f1 -> <VAR>
    */
   public void visit(Declaracion n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> "int"
    *       | "String"
    *       | "float"
    */
   public void visit(Tipo n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> "enter"
    * f1 -> "("
    * f2 -> <VAR>
    * f3 -> ")"
    */
   public void visit(Sent_read n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
   }

   /**
    * f0 -> "print"
    * f1 -> "("
    * f2 -> ( Exp() | <CADENA> )
    * f3 -> ")"
    */
   public void visit(Sent_write n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
   }

   /**
    * f0 -> <VAR>
    * f1 -> "="
    * f2 -> ( Exp() | <CADENA> )
    */
   public void visit(Asignacion n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
   }

   /**
    * f0 -> Exp_simple()
    * f1 -> ( Op_comp() Exp_simple() )?
    */
   public void visit(Exp n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> "=="
    *       | "<"
    *       | ">"
    *       | "<="
    *       | ">="
    *       | "!="
    */
   public void visit(Op_comp n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> Term()
    * f1 -> ( ( Op_suma() | Op_resta() ) Term() )*
    */
   public void visit(Exp_simple n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> "+"
    */
   public void visit(Op_suma n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> "-"
    */
   public void visit(Op_resta n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> Factor()
    * f1 -> ( Op_mult() Factor() )*
    */
   public void visit(Term n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> "*"
    *       | "/"
    *       | "%"
    */
   public void visit(Op_mult n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> Factor2()
    * f1 -> ( Op_mod() Factor2() )*
    */
   public void visit(Factor n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> "**"
    *       | "%%"
    */
   public void visit(Op_mod n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> "(" Exp() ")"
    *       | <INTEGER>
    *       | <FLOAT>
    *       | <VAR>
    */
   public void visit(Factor2 n) {
      n.f0.accept(this);
   }

}
