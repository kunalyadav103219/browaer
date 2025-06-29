package fulguris.database.bookmark;

import android.content.Context;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import fulguris.R;
import fulguris.database.Bookmark;
import fulguris.utils.Preconditions;
import fulguris.utils.Utils;
import androidx.annotation.NonNull;

import fulguris.database.WebPageKt;
import io.reactivex.Completable;
import timber.log.Timber;

/**
 * The class responsible for importing and exporting
 * bookmarks in the JSON format.
 * <p>
 * Created by anthonycr on 5/7/17.
 */
public final class BookmarkExporter {

    private static final String TAG = "BookmarkExporter";

    private static final String KEY_URL = "url";
    private static final String KEY_TITLE = "title";
    private static final String KEY_FOLDER = "folder";
    private static final String KEY_ORDER = "order";

    private BookmarkExporter() {
    }

    /**
     * Retrieves all the default bookmarks stored
     * in the raw file within assets.
     *
     * @param context the context necessary to open assets.
     * @return a non null list of the bookmarks stored in assets.
     */
    @NonNull
    public static List<Bookmark.Entry> importBookmarksFromAssets(@NonNull Context context) {
        List<Bookmark.Entry> bookmarks = new ArrayList<>();
        BufferedReader bookmarksReader = null;
        InputStream inputStream = null;
//        try {
//            inputStream = context.getResources().openRawResource(R.raw.default_bookmarks);
//            //noinspection IOResourceOpenedButNotSafelyClosed
//            bookmarksReader = new BufferedReader(new InputStreamReader(inputStream));
//            String line;
//            while ((line = bookmarksReader.readLine()) != null) {
//                try {
//                    JSONObject object = new JSONObject(line);
//                    final String folderTitle = object.getString(KEY_FOLDER);
//                    bookmarks.add(
//                        new Bookmark.Entry(
//                            object.getString(KEY_URL),
//                            object.getString(KEY_TITLE),
//                            object.getInt(KEY_ORDER),
//                            WebPageKt.asFolder(folderTitle)
//                        )
//                    );
//                } catch (JSONException e) {
//                    Timber.e(e, "Can't parse line %s", line);
//                }
//            }
//        } catch (IOException e) {
//            Timber.e(e, "Error reading the bookmarks file");
//        } finally {
//            Utils.close(bookmarksReader);
//            Utils.close(inputStream);
//        }

        return bookmarks;
    }

    /**
     * Exports the list of bookmarks to a file.
     *
     * @param bookmarkList the bookmarks to export.
     * @param aStream      the stream to export to.
     * @return an observable that emits a completion
     * event when the export is complete, or an error
     * event if there is a problem.
     */
    @NonNull
    public static Completable exportBookmarksToFile(@NonNull final List<Bookmark.Entry> bookmarkList,
                                                    @NonNull final OutputStream aStream) {
        return Completable.fromAction(() -> {
//            Preconditions.checkNonNull(bookmarkList);
//            BufferedWriter bookmarkWriter = null;
//            try {
//                //noinspection IOResourceOpenedButNotSafelyClosed
//                bookmarkWriter = new BufferedWriter(new OutputStreamWriter(aStream));
//
//                JSONObject object = new JSONObject();
//                for (Bookmark.Entry item : bookmarkList) {
//                    object.put(KEY_TITLE, item.getTitle());
//                    object.put(KEY_URL, item.getUrl());
//                    object.put(KEY_FOLDER, item.getFolder().getTitle());
//                    object.put(KEY_ORDER, item.getPosition());
//                    bookmarkWriter.write(object.toString());
//                    bookmarkWriter.newLine();
//                }
//            } finally {
//                Utils.close(bookmarkWriter);
//            }
        });
    }

    /**
     * Attempts to import bookmarks from the
     * given file. If the file is not in a
     * supported format, it will fail.
     *
     * @param inputStream The stream to import from.
     * @return A list of bookmarks, or throws an exception if the bookmarks cannot be imported.
     */
    @NonNull
    public static List<Bookmark.Entry> importBookmarksFromFileStream(@NonNull InputStream inputStream) throws Exception {
        BufferedReader bookmarksReader = null;
        try {
            //noinspection IOResourceOpenedButNotSafelyClosed
            bookmarksReader = new BufferedReader(new InputStreamReader(inputStream));
            String line;

            List<Bookmark.Entry> bookmarks = new ArrayList<>();
//            while ((line = bookmarksReader.readLine()) != null) {
//                JSONObject object = new JSONObject(line);
//                final String folderName = object.getString(KEY_FOLDER);
//                final Bookmark.Entry entry = new Bookmark.Entry(
//                        object.getString(KEY_URL),
//                        object.getString(KEY_TITLE),
//                        object.getInt(KEY_ORDER),
//                        WebPageKt.asFolder(folderName)
//                );
//                bookmarks.add(entry);
//            }

            return bookmarks;
        } finally {
//            Utils.close(bookmarksReader);
        }
    }
}



