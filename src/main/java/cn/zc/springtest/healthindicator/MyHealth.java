package cn.zc.springtest.healthindicator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * custom HealthIndicators
 * @author zero
 *
 */
//@Component
public class MyHealth implements HealthIndicator {

    @Override
    public Health health() {
        int errorCode = check(); // perform some specific health check
        if (errorCode != 0) {
            return Health.down().withDetail("Error Code", errorCode).build();
        }
        return Health.up().build();
    }

    /**
     * 检测服务是否down掉
     * @return
     */
	private int check() {
		// TODO Auto-generated method stub
		return 0;
	}

}
