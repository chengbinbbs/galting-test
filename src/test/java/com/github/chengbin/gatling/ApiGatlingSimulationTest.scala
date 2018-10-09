package com.github.chengbin.gatling
import io.gatling.core.scenario.Simulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration.FiniteDuration
import scala.concurrent.duration.Duration
import java.util.concurrent.TimeUnit

class ApiGatlingSimulationTest extends Simulation {

  val scn = scenario("getMatchInfo").repeat(1000, "n") {
    exec(
      http("match-API")
        .post("http://localhost:8080/football/match")
        .header("Content-Type", "application/json")
        .body(StringBody("""{"matchId":"20180115004"}"""))
        .check(status.is(200))
    ).pause(Duration.apply(5, TimeUnit.MILLISECONDS))
  }

  setUp(scn.inject(atOnceUsers(30))).maxDuration(FiniteDuration.apply(30, "second"))

}