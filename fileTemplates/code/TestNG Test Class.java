import com.ritoinfo.admin.AdminApplication;
import com.ritoinfo.unittest.base.ShiroUnitTest;
import com.ritoinfo.unittest.util.RequestPathUtil;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;
import org.testng.annotations.Test;

#parse("File Header.java")

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = {AdminApplication.class})

#set($LEN = $NAME.length() - 4)
#set($PATH = $NAME.substring(0,$LEN))
public class ${NAME} extends ShiroUnitTest {
    
    @Override
    public boolean ingoreCheckMethod() {
        return true;
    }
    
    @Override
    public String getControllerRequestMapping(){
        return RequestPathUtil.getRequestMappingStr(${PATH}.class);
    }
    
    ${BODY}

}
