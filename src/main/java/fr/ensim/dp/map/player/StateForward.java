package fr.ensim.dp.map.player;

public class StateForward implements IStatePlayer{
    @Override
    public void play(IPlayer player) {
        throw new IllegalStateException();
    }

    @Override
    public void stop(IPlayer player) {
        player.firechangeState(new StatePlay());
    }

    @Override
    public void pause(IPlayer player) {
        throw new IllegalStateException();
    }

    @Override
    public void forward(IPlayer player) {
        player.firechangeState(new StateForward());
    }

    @Override
    public void backward(IPlayer player) {
        player.firechangeState(new StateBackward());
    }
}
