package Barman;

public class Barman {
    public static void main(String[] args) {
        Barman barman = new Barman();
        System.out.println(barman.createDrink("soczek", 10, "wódka", 20, "ananasek", 50));
        Ingredient ingredient1 = new Ingredient("soczek", 10);
Ingredient ingredient2 = new Ingredient("wódka", 20);
Ingredient ingredient3 = new Ingredient("ananasek", 50);
Drink drink = new Drink(ingredient1, ingredient2, ingredient3);
barman.printDrink(drink);
    }
    private Drink createDrink(String skladnik1, double amount1, String skladnik2, double amount2, String skladnik3, double amount3) {
        Ingredient ing1 = new Ingredient(skladnik1, amount1);
        Ingredient ing2 = new Ingredient(skladnik2, amount2);
        Ingredient ing3 = new Ingredient(skladnik3, amount3);
        return new Drink(ing1, ing2, ing3);
    }
    private void printDrink(Drink drink) {
        double ingredientSum = drink.getIngredient1().getAmount() + drink.getIngredient2().getAmount() + drink.getIngredient3().getAmount();
   double igr1Part = drink.getIngredient1().getAmount()/ingredientSum;
   double igr2Part = drink.getIngredient2().getAmount()/ingredientSum;
   double igr3Part = drink.getIngredient3().getAmount()/ingredientSum;

        System.out.println(String.format("Składniki drinka to: %s, %s, %s w proporcjach %.2f, %.2f, %.2f jego pojemność to %.0f ml", drink.getIngredient1().getName(), drink.getIngredient2().getName(),
                drink.getIngredient3().getName(), igr1Part, igr2Part, igr3Part, ingredientSum));
    } }

