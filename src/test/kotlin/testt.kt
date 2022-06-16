import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class proyectoTest : DescribeSpec({
    isolationMode = IsolationMode.InstancePerTest

    describe("test") {

        it("test") {
            true shouldBe true
        }
    }

})