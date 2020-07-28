class PresenterDice (val view: InterfaceDice.View): InterfaceDice.Presenter {

    override fun process(currentDice: Int) {
        var score = 0
        if (currentDice % 2 == 0) {
            score = -3
        } else score = 5
        view.scoreResult(score)
    }
}