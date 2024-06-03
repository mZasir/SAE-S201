# **Calculatrice simple en Java**

Ce projet consiste en une calculatrice simple développée en Java, capable d'effectuer des opérations arithmétiques de base sur des nombres entiers.

**Fonctionnalités**

La calculatrice prend en charge les opérations suivantes :

Addition (+)
Soustraction (-)
Multiplication (*)
Division (/)

**Structure du Projet**

Le projet est divisé en plusieurs classes Java, chacune responsable d'une partie spécifique de la calculatrice :

Nombre: Représente un nombre entier.
Operation: Classe abstraite représentant une opération arithmétique.
Addition, Soustraction, Multiplication, Division: Implémentent les opérations arithmétiques spécifiques.
TestOperation: Classe principale avec la méthode main() pour tester les fonctionnalités de la calculatrice. 

**Utilisation**

Clonez ce dépôt sur votre machine locale.
Ouvrez le projet dans votre environnement de développement Java.
Exécutez la classe TestOperation pour tester les opérations.

**Exemple d'utilisation :**

```java
Nombre cinq = new Nombre(5);
Nombre trois = new Nombre(3);
Operation addition = new Addition(cinq, trois);
System.out.println(addition + " = " + addition.valeur()); // Affiche (5 + 3) = 8
```


**Auteurs**

Ce projet a été réalisé par Zasir Moinootheen et Inès Marcisz, dans le cadre de la SAE-S201.
