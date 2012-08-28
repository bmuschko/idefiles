#set ($classUnderTest = $NAME.replace("Test", ""))
#set ($instanceUnderTest = "${classUnderTest.substring(0,1).toLowerCase()}${classUnderTest.substring(1)}")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

#parse("File Header.java")
@RunWith(MockitoJUnitRunner.class)
public class ${NAME} {
	private ${classUnderTest} ${instanceUnderTest};

	@Before
	public void setUp() {
		${instanceUnderTest} = new ${classUnderTest}();
	}

	@After
	public void tearDown() {
		${instanceUnderTest} = null;
	}
}
