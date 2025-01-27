import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements MarketBehavior, QueueBehavior{
    private Queue<Actor> queue = new LinkedList<>();;//очередь
    private List<Actor> market = new LinkedList<>();;//магазин


    @Override
    public void acceptToMarket(Actor actor) {
        this.market.add(actor);
        System.out.println(actor.getName() + " добавлен в магазин");
    }

    @Override
    public void releaseFromMarket(List<Actor> actorList) {
        for (Actor actor: market) {
            if (market.remove(actor)) {
                System.out.println(actor.getName() + " удален из магазина");
        }
        else {
            System.out.println(actor.getName() + " не найден в магазине");
        }
        }
    }

    @Override
    public void update() {
        System.out.println("Обновление состояния магазина...");
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
        System.out.println(actor.getName() + " добавлен в очередь");
    }

    @Override
    public void takeOrder() {
        Actor actor = queue.peek();
        if (actor != null) {
            System.out.println(actor.getName() + " оформил заказ");
        }
        else {
            System.out.println("Очередь пуста");
        }

    }

    @Override
    public void giveOrder() {
        Actor actor = queue.poll();
        if (actor != null) {
            System.out.println(actor.getName() + " получил заказ");
        }
        else {
            System.out.println("Очередь пуста");
        }

    }

    @Override
    public void releaseFromQueue() {
        Actor actor = queue.poll();
        if (actor != null) {
            System.out.println(actor.getName() + " удален из очереди");
        }
        else {
            System.out.println("Очередь пуста");
        }

    }

}
