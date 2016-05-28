package com.accounted4.amrs.config;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.stereotype.Component;

/**
 *
 * @author gheinze
 */
@Component
public class TenantIdentifierResolver implements CurrentTenantIdentifierResolver {

    private static final String DEFAULT_TENANT = "public";

    // Examples Autowire the HttpServletRequest and extract the tenant from there.
    // TODO: logic to determine tenant
    @Override
    public String resolveCurrentTenantIdentifier() {
//        UserSession userSession = getUserSession();
//        return null == userSession ? DEFAULT_TENANT : userSession.getTenant();
    return DEFAULT_TENANT;
    }


    @Override
    public boolean validateExistingCurrentSessions() {
        return true;
    }


}
