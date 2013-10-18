package idea.plugins.salesforce.typeFactories;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import idea.plugins.salesforce.types.VisualforcePageFileType;
import org.jetbrains.annotations.NotNull;

public class VisualforcePageFileFactory extends FileTypeFactory {

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumer.consume(VisualforcePageFileType.INSTANCE);
    }
}