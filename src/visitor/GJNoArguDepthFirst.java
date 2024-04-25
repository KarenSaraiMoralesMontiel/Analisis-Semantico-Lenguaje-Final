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
public class GJNoArguDepthFirst<R> implements GJNoArguVisitor<R> {
   //
   // Auto class visitors--probably don't need to be overridden.
   //
   public R visit(NodeList n) {
      R _ret=null;
      int _count=0;
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
         e.nextElement().accept(this);
         _count++;
      }
      return _ret;
   }

   public R visit(NodeListOptional n) {
      if ( n.present() ) {
         R _ret=null;
         int _count=0;
         for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
            e.nextElement().accept(this);
            _count++;
         }
         return _ret;
      }
      else
         return null;
   }

   public R visit(NodeOptional n) {
      if ( n.present() )
         return n.node.accept(this);
      else
         return null;
   }

   public R visit(NodeSequence n) {
      R _ret=null;
      int _count=0;
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
         e.nextElement().accept(this);
         _count++;
      }
      return _ret;
   }

   public R visit(NodeToken n) { return null; }

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> ( Sentencia() )*
    */
   public R visit(SentenciaMuchas n) {
      R _ret=null;
      n.f0.accept(this);
      return _ret;
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
   public R visit(Sentencia n) {
      R _ret=null;
      n.f0.accept(this);
      return _ret;
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
   public R visit(While n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
      n.f6.accept(this);
      return _ret;
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
   public R visit(For n) {
      R _ret=null;
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
      return _ret;
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
   public R visit(SentenciaIf n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
      n.f6.accept(this);
      n.f7.accept(this);
      return _ret;
   }

   /**
    * f0 -> ( Op_Not() )?
    * f1 -> Exp()
    * f2 -> ( ( ( Op_Not() | Op_OrAnd() ) Exp() )+ )?
    */
   public R visit(Comparison n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      return _ret;
   }

   /**
    * f0 -> "!"
    */
   public R visit(Op_Not n) {
      R _ret=null;
      n.f0.accept(this);
      return _ret;
   }

   /**
    * f0 -> "|"
    *       | "&&"
    */
   public R visit(Op_OrAnd n) {
      R _ret=null;
      n.f0.accept(this);
      return _ret;
   }

   /**
    * f0 -> Tipo()
    * f1 -> <VAR>
    */
   public R visit(Declaracion n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      return _ret;
   }

   /**
    * f0 -> "int"
    *       | "String"
    *       | "float"
    */
   public R visit(Tipo n) {
      R _ret=null;
      n.f0.accept(this);
      return _ret;
   }

   /**
    * f0 -> "enter"
    * f1 -> "("
    * f2 -> <VAR>
    * f3 -> ")"
    */
   public R visit(Sent_read n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      return _ret;
   }

   /**
    * f0 -> "print"
    * f1 -> "("
    * f2 -> ( Exp() | <CADENA> )
    * f3 -> ")"
    */
   public R visit(Sent_write n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      return _ret;
   }

   /**
    * f0 -> <VAR>
    * f1 -> "="
    * f2 -> ( Exp() | <CADENA> )
    */
   public R visit(Asignacion n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      return _ret;
   }

   /**
    * f0 -> Exp_simple()
    * f1 -> ( Op_comp() Exp_simple() )?
    */
   public R visit(Exp n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      return _ret;
   }

   /**
    * f0 -> "=="
    *       | "<"
    *       | ">"
    *       | "<="
    *       | ">="
    *       | "!="
    */
   public R visit(Op_comp n) {
      R _ret=null;
      n.f0.accept(this);
      return _ret;
   }

   /**
    * f0 -> Term()
    * f1 -> ( ( Op_suma() | Op_resta() ) Term() )*
    */
   public R visit(Exp_simple n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      return _ret;
   }

   /**
    * f0 -> "+"
    */
   public R visit(Op_suma n) {
      R _ret=null;
      n.f0.accept(this);
      return _ret;
   }

   /**
    * f0 -> "-"
    */
   public R visit(Op_resta n) {
      R _ret=null;
      n.f0.accept(this);
      return _ret;
   }

   /**
    * f0 -> Factor()
    * f1 -> ( Op_mult() Factor() )*
    */
   public R visit(Term n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      return _ret;
   }

   /**
    * f0 -> "*"
    *       | "/"
    *       | "%"
    */
   public R visit(Op_mult n) {
      R _ret=null;
      n.f0.accept(this);
      return _ret;
   }

   /**
    * f0 -> Factor2()
    * f1 -> ( Op_mod() Factor2() )*
    */
   public R visit(Factor n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      return _ret;
   }

   /**
    * f0 -> "**"
    *       | "%%"
    */
   public R visit(Op_mod n) {
      R _ret=null;
      n.f0.accept(this);
      return _ret;
   }

   /**
    * f0 -> "(" Exp() ")"
    *       | <INTEGER>
    *       | <FLOAT>
    *       | <VAR>
    */
   public R visit(Factor2 n) {
      R _ret=null;
      n.f0.accept(this);
      return _ret;
   }

}