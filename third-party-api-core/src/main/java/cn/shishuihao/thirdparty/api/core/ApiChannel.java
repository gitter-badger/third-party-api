package cn.shishuihao.thirdparty.api.core;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

/**
 * @author shishuihao
 * @version 1.0.0
 */

public interface ApiChannel<P extends ApiProperties> extends Entity<String>, ApiRepository {
    /**
     * get api by api type
     *
     * @param apiType api type
     * @return api
     */
    <A extends Api<A, T, R>, T extends ApiRequest<A, T, R>, R extends ApiResponse> Optional<A> getApi(final Class<A> apiType);

    /**
     * get properties type
     * immutable
     *
     * @return properties type
     */
    Class<P> propertiesType();

    /**
     * get new empty properties
     * immutable
     *
     * @return new properties
     */
    default P newProperties() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return propertiesType().getDeclaredConstructor().newInstance();
    }
}
