import org.specs2.mutable._
import org.specs2.mock.Mockito
import org.mockito.Matchers._

class ProperSpec extends Specification with Mockito{
	"Proper" should {
		"can create new Instance" in {
			Proper(1, "hoge", 22) must_== Proper(1, "hoge", 22)
		}

		"admit create new Instance" in {
			implicit val m = mock[ProperImpl]

			m.admit("fuga", 20) returns Proper(0, "fuga", 20)

			Proper.admit("fuga", 20) must_== Proper(0, "fuga", 20)
		}
	
	}
}
