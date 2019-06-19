package spitest;

import java.util.Optional;
import java.util.ServiceLoader;
import java.util.stream.StreamSupport;

/**
 * @author haicheng.lhc@alibaba-inc.com 2019/03/11
 * @date 2019/03/11
 */

public class SerializerService {
    public ObjectSerializer getSerializerService(){
        ServiceLoader<ObjectSerializer> serializers = ServiceLoader.load(ObjectSerializer.class);

        final Optional<ObjectSerializer> serializer = StreamSupport.stream(serializers.spliterator(), false)
            .findAny().filter(t -> t.getName().contains("KryoSerializer"));

        return serializer.orElse(new JavaSerializer());
    }

}
