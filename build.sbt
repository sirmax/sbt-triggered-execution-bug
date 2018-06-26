lazy val root = project.in(file("."))
  .aggregate(sub1, sub2)

lazy val sub1 = project

lazy val sub2 = project
