package scalaz.example


object Example {
  def run {
    ExampleApplicative.run
    ExampleArrow.run
    ExampleBifunctor.run
    ExampleBKTree.run
    ExampleCategory.run
    ExampleCofunctor.run
    ExampleComp.run
    ExampleDistance.run
    ExampleFunctor.run
    ExampleFold.run
    ExampleEqual.run
    ExampleKleisli.run
    ExampleIdentity.run
    ExampleList.run
    ExampleMonad.run
    ExampleMonoid.run
    ExamplePlus.run
    ExampleState.run
    ExampleTree.run
    ExampleTraverse.run
    ExampleValidation.run
    geo.ExampleVincenty.run
    math.ExampleFAD.run
    concurrent.ExampleActor.run
    WordCount.wordCount
  }

  def main(args: Array[String]) = run
}