import java.util.List;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Actor Mark = new Actor("Mark") {
            @Override
            public void setMakeOrder(boolean makeOrder) {

            }

            @Override
            public void setTakeOrder(boolean takeOrder) {

            }

            @Override
            public boolean isMakeOrder() {
                return false;
            }

            @Override
            public boolean isTakeOrder() {
                return false;
            }
        };
        Actor Anna = new Actor("Anna") {
            @Override
            public void setMakeOrder(boolean makeOrder) {

            }

            @Override
            public void setTakeOrder(boolean takeOrder) {

            }

            @Override
            public boolean isMakeOrder() {
                return false;
            }

            @Override
            public boolean isTakeOrder() {
                return false;
            }
        };
        market.acceptToMarket(Mark);
        market.acceptToMarket(Anna);
        market.takeInQueue(Mark);
        market.update();
        market.takeInQueue(Anna);
        market.update();
        market.releaseFromMarket(List.of(Mark, Anna));
    }

    }
