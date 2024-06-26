//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * All GJ visitors must implement this interface.
 */

public interface GJVisitor<R,A> {

   //
   // GJ Auto class visitors
   //

   public R visit(NodeList n, A argu);
   public R visit(NodeListOptional n, A argu);
   public R visit(NodeOptional n, A argu);
   public R visit(NodeSequence n, A argu);
   public R visit(NodeToken n, A argu);

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> ( Sentencia() )*
    */
   public R visit(SentenciaMuchas n, A argu);

   /**
    * f0 -> Declaracion() ";"
    *       | Sent_read() ";"
    *       | Sent_write() ";"
    *       | Asignacion() ";"
    *       | While()
    *       | For()
    *       | SentenciaIf()
    */
   public R visit(Sentencia n, A argu);

   /**
    * f0 -> "while"
    * f1 -> "("
    * f2 -> Comparison()
    * f3 -> ")"
    * f4 -> "{"
    * f5 -> SentenciaMuchas()
    * f6 -> "}"
    */
   public R visit(While n, A argu);

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
   public R visit(For n, A argu);

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
   public R visit(SentenciaIf n, A argu);

   /**
    * f0 -> ( Op_Not() )?
    * f1 -> Exp()
    * f2 -> ( ( ( Op_Not() | Op_OrAnd() ) Exp() )+ )?
    */
   public R visit(Comparison n, A argu);

   /**
    * f0 -> "!"
    */
   public R visit(Op_Not n, A argu);

   /**
    * f0 -> "|"
    *       | "&&"
    */
   public R visit(Op_OrAnd n, A argu);

   /**
    * f0 -> Tipo()
    * f1 -> <VAR>
    */
   public R visit(Declaracion n, A argu);

   /**
    * f0 -> "int"
    *       | "String"
    *       | "float"
    */
   public R visit(Tipo n, A argu);

   /**
    * f0 -> "enter"
    * f1 -> "("
    * f2 -> <VAR>
    * f3 -> ")"
    */
   public R visit(Sent_read n, A argu);

   /**
    * f0 -> "print"
    * f1 -> "("
    * f2 -> ( Exp() | <CADENA> )
    * f3 -> ")"
    */
   public R visit(Sent_write n, A argu);

   /**
    * f0 -> <VAR>
    * f1 -> "="
    * f2 -> ( Exp() | <CADENA> )
    */
   public R visit(Asignacion n, A argu);

   /**
    * f0 -> Exp_simple()
    * f1 -> ( Op_comp() Exp_simple() )?
    */
   public R visit(Exp n, A argu);

   /**
    * f0 -> "=="
    *       | "<"
    *       | ">"
    *       | "<="
    *       | ">="
    *       | "!="
    */
   public R visit(Op_comp n, A argu);

   /**
    * f0 -> Term()
    * f1 -> ( ( Op_suma() | Op_resta() ) Term() )*
    */
   public R visit(Exp_simple n, A argu);

   /**
    * f0 -> "+"
    */
   public R visit(Op_suma n, A argu);

   /**
    * f0 -> "-"
    */
   public R visit(Op_resta n, A argu);

   /**
    * f0 -> Factor()
    * f1 -> ( Op_mult() Factor() )*
    */
   public R visit(Term n, A argu);

   /**
    * f0 -> "*"
    *       | "/"
    *       | "%"
    */
   public R visit(Op_mult n, A argu);

   /**
    * f0 -> Factor2()
    * f1 -> ( Op_mod() Factor2() )*
    */
   public R visit(Factor n, A argu);

   /**
    * f0 -> "**"
    *       | "%%"
    */
   public R visit(Op_mod n, A argu);

   /**
    * f0 -> "(" Exp() ")"
    *       | <INTEGER>
    *       | <FLOAT>
    *       | <VAR>
    */
   public R visit(Factor2 n, A argu);

}
