interface InterfaceDice {

    interface Presenter {
        fun process (currentDice: Int)
    }

    interface View {
        fun scoreResult(score: Int)
    }
}