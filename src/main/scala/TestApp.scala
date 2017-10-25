import pb.ProgressBar

object TestApp {
    def main(args: Array[String]) {
        for (i <- 1 to 10) {
            val count = 1000 - i * 10
            var pb = new ProgressBar(count, Some("Нечто"))
            //pb.showSpeed = false
            for (_ <- 1 to count) {
                pb += 1
                Thread.sleep(2)
            }
            println("done")
        }
    }
}
