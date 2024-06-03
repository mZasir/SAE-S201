public class TestOperation {
    /**
     * Nom du projet : Calculatrice SAE R201
     * Auteurs : Zasir MOINOOTHEEN et Inès MARCISZ
     */
    public static void main (String args[]){
        try { 
<<<<<<< HEAD
        Expression huit = new Nombre(8) ;
        Expression onze = new Nombre(11) ;
        Expression cinq = new Nombre(15) ;
        Expression m = new Multiplication(huit, onze) ;
        Expression m2 = new Multiplication (m, cinq) ;
        System.out.println(m2 + "=" + m2.valeur()); // affiche (8 * 11) * 5 = 440

=======
        Expression zero = new Nombre (0) ;
>>>>>>> dd29ba1738fe00d0d898e1cc5d17aa3b6007d73f
        Expression deux = new Nombre(2) ;
        Expression trois = new Nombre(3) ;
        Expression huit = new Nombre(8) ;
        Expression onze = new Nombre(11) ;
        Expression quinze = new Nombre(15) ;
        Expression dixSept = new Nombre(17) ;

        Expression m = new Multiplication(huit, onze) ;
        Expression m2 = new Multiplication (m, quinze) ;
        System.out.println(m2 + "=" + m2.valeur()); // affiche (8 * 11) * 15 = 440
 

        try{
            Expression d = new Division (m, zero) ;
            System.out.println(d + "=" + d.valeur()) ; 
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
        Expression s = new Soustraction(dixSept, deux) ;
        Expression a = new Addition(deux, trois) ;
        Expression d2 = new Division(s, a) ;
        System.out.println(d2 + " = " + d2.valeur()) ; // affiche ((17 - 2) / (2 + 3)) = 3 

<<<<<<< HEAD
        Expression zero = new Nombre (0) ;
        Expression d2 = new Division (m, zero) ;
        System.out.println(d + "=" + d.valeur()) ; 
=======
        // Test FabriqueExpression
        
        System.out.println("\n Test de la méthode fabriqueExpression :");

        String expressionStr = "((8*11)*15)";
        Expression expression = fabriqueExpression(expressionStr);
        System.out.println(expression + " = " + expression.valeur());

        expressionStr = "((17-2)/(2+3))";
        expression = fabriqueExpression(expressionStr);
        System.out.println(expression + " = " + expression.valeur());
    
>>>>>>> dd29ba1738fe00d0d898e1cc5d17aa3b6007d73f

    } catch (Exception e) {
        System.out.println("Il y a eu une erreur : " + e) ;
        }
    }

    public static Expression fabriqueExpression(String e) {
        // si l'expression est un nombre, on retourne un objet Nombre
        if (e.matches("\\d+")) {
            return new Nombre(Integer.parseInt(e));
        }
    
        // Retire les parenthèses extérieures si présentes
        if ( e.charAt(0) == '(' && e.charAt(e.length()-1) == ')' ){
            e = e.substring(1, e.length() - 1);
        }
    
        // Trouve l'opérateur principal en respectant les parenthèses
        int nbParentheses = 0;
        for (int i = 0; i < e.length(); i++) {
            char c = e.charAt(i);
            if (c == '(') {
                nbParentheses++;
            } else if (c == ')') {
                nbParentheses--;
            } else if (nbParentheses == 0 && (c == '+' || c == '-' || c == '*' || c == '/')) {
                // Découpe l'expression en opérandes gauche et droite
                String opGauche = e.substring(0, i);
                String opDroite = e.substring(i + 1);

                // Appel récursif
                Expression expGauche = fabriqueExpression(opGauche);
                Expression expDroite = fabriqueExpression(opDroite);
    
                switch (c) {
                    case '+':
                        return new Addition(expGauche, expDroite);
                    case '-':
                        return new Soustraction(expGauche, expDroite);
                    case '*':
                        return new Multiplication(expGauche, expDroite);
                    case '/':
                        return new Division(expGauche, expDroite);
                }
            }
        }
    
        throw new IllegalArgumentException("Expression mal formée : " + e);
    }

}


