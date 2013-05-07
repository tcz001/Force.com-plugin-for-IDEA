package idea.plugins.salesforce.file.typeFactories;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import idea.plugins.salesforce.file.types.ApexTriggerFileType;
import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: p.demeshchik
 * Date: 07.05.13
 * Time: 14:55
 * To change this template use File | Settings | File Templates.
 */
public class ApexTriggerFileFactory extends FileTypeFactory {

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumer.consume(ApexTriggerFileType.INSTANCE);
    }
}
