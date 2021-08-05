package nerdschool.bar;

public class Pub {
    public static final String ONE_BEER        = "hansa";
    public static final String ONE_CIDER       = "grans";
    public static final String A_PROPER_CIDER  = "strongbow";
    public static final String GT              = "gt";
    public static final String BACARDI_SPECIAL = "bacardi_special";
    final iSpecialOfferHandler specialOfferHandler;
    
    public Pub(){
       specialOfferHandler = new SpecialOfferHandler();
    }
    
    public int computeOrderCost(Order order) {
        validateDrinkOrder(order);
        if (specialOfferHandler.isSpecialOrder(order)) {
            return calculateCostWithSpecialOffer(order);
        }
        return calculateDrinksCost(order);
    }
       
    private void    validateDrinkOrder(Order order){
        if (order.amount > 2 && restrictedDrinks(order.drink)) {
            throw new RuntimeException("Too many drinks, max 2.");
        }
    }
    
    private boolean restrictedDrinks(String drink) {
        return (drink.equals(GT) || drink.equals(BACARDI_SPECIAL));
    }
    
    private int     calculateCostWithSpecialOffer(Order order) {
        return (int) (calculatePriceByDrink(order.drink) * order.amount * (1 - specialOfferHandler.getDiscount()));
    }
    
    private int     calculatePriceByDrink(String drink) {
        payable payableDrink = getPayableDrink(drink);
        return payableDrink.getCost();
    }
    
    private payable getPayableDrink(String drink){
        payable payableDrink;
        switch (drink) {
            case ONE_BEER:
                payableDrink = new OneBeer();
                break;
            case ONE_CIDER:
                payableDrink = new OneCider();
                break;
            case A_PROPER_CIDER:
                payableDrink = new AProperCider();
                break;
            case GT:
                payableDrink = new Gt();
                break;
            case BACARDI_SPECIAL:
                payableDrink = new BacardiSpecial();
                break;
            default:
                throw new RuntimeException("No such drink exists");
        }
        return payableDrink;
    }
    
    private int     calculateDrinksCost(Order order) {
        return order.amount * calculatePriceByDrink(order.drink);
    }
}