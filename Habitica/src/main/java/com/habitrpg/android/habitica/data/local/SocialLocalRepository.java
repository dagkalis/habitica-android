package com.habitrpg.android.habitica.data.local;

import com.habitrpg.android.habitica.models.social.Challenge;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import com.habitrpg.android.habitica.models.social.Group;

import java.util.List;

import io.realm.RealmResults;
import rx.Observable;
import rx.functions.Action1;

public interface SocialLocalRepository extends BaseLocalRepository {
    Observable<RealmResults<Group>> getGroups(String type);
    Observable<RealmResults<Group>> getPublicGuilds();

    Observable<Group> getGroup(String id);

    void saveGroup(Group group);

    void saveGroups(List<Group> groups);

    Observable<RealmResults<Group>> getUserGroups();

    Observable<RealmResults<ChatMessage>> getGroupChat(String groupId);

    void deleteMessage(String id);
}
