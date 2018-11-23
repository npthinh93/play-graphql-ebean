// @GENERATOR:play-routes-compiler
// @SOURCE:/home/phucthinh/workspace/play-java-hello-world-tutorial/conf/routes
// @DATE:Fri Nov 23 11:35:10 ICT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
