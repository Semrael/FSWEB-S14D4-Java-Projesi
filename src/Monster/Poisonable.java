package Monster;

import Monster.util.Constants;

public interface Poisonable {
    default double poison(){
        return Constants.POİSON_PERCENTAGE;
    }

}
