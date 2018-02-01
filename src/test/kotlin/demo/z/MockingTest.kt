package demo.z

import com.nhaarman.mockito_kotlin.doReturn
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import org.junit.Test

class MockingTest {

    @Test
    fun `test mit mocks`() {
        val mock = mock<TestInterface> {
            on { intProperty } doReturn 1
            on { getString() } doReturn "Hello World!"
        }

        assert(mock.intProperty == 1)
        assert(mock.getString() == "Hello World!")

        verify(mock).intProperty
        verify(mock).getString()
    }
}
