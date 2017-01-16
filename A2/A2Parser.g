parser grammar A2Parser;

/** tell ANTLR what the lexer is */
options { tokenVocab = A2Lexer; }

@header {
}

@members {
/** Initialize debug level to 0 */
int debug_level=0;
}



prog:   stat+ ;
                
stat:   JTXT {System.out.print($JTXT.text);}
	|	STRING {System.out.print($STRING.text);}
    |   A2 out=ID EQ OUTLIST BRSTART i1=ID COMMA i2=ID COMMA i3=ID COMMA i4=ID COMMA i5=ID COMMA CSTART JALL
        {
            String id4 = $i4.text;
            String str = $JALL.text; str = str.trim(); str = str.substring(0, str.length() - 2);
            System.out.println("//#" + $out.text + "=" + $OUTLIST.text + "[" + $i1.text + "," + $i2.text + "," + $i3.text + "," + $i4.text + "," + $i5.text + ",{" + $JALL.text);
            System.out.println("        {");
            System.out.println("            List<" + id4 + "> outListInternal = new LinkedList<" + id4 + ">();");
            System.out.println("            for (" + $i2.text + $i3.text + " : " + $i1.text + ")");
            System.out.println("            {");
            System.out.println("            " + $i4.text + " " + $i5.text + ";");
            System.out.println("            " + str);
            System.out.println("            outListInternal.add(" + $i5.text + ");");
            System.out.println("            }");
            System.out.println("        " + $out.text + "=outListInternal;");
            System.out.println("        }");
            System.out.println("// end of translated code");
        }
    |   A2 out=ID EQ OUTLIST BRSTART i1=ID COMMA i2=ID COMMA i3=ID COMMA CSTART JALL
        {
            System.out.println("//#" + $out.text + "=" + $OUTLIST.text + "[" + $i1.text + "," + $i2.text + "," + $i3.text + ",{" + $JALL.text);   
            System.out.println("        {");
            System.out.println("            List<" + $i2.text + "> outListInternal=new LinkedList<" + $i2.text + ">();");
            System.out.println("            for (" + $i2.text + " " + $i3.text + " : " + $i1.text + ")");
            System.out.println("            {");
            System.out.println("                if (" + $i3.text + ".length()>5)");
            System.out.println("                {");
            System.out.println("                    outListInternal.add(" + $i3.text + ");");
            System.out.println("                }");
            System.out.println("            }");
            System.out.println("            " + $out.text + "=outListInternal;");
            System.out.println("        }");
            System.out.println("// end of translated code");
        }
    |   A2 out=ID EQ OUTVAL BRSTART i1=ID COMMA i2=ID COMMA i3=ID COMMA CSTART JALL
        {
            String str = $JALL.text; str = str.trim(); str = str.substring(0, str.length() - 2);
            System.out.println("//#" + $out.text + "=" + $OUTVAL.text + "[" + $i1.text + "," + $i2.text + "," + $i3.text + ",{" + $JALL.text);
            System.out.println("        {");
            System.out.println("            for (" + $i2.text + " " + $i3.text + " : " + $i1.text + ")");
            System.out.println("            {");
            System.out.println("                " + str);
            System.out.println("            }");
            System.out.println("        }");
            System.out.println("// end of translated code");
        }

    ;



