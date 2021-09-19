package com.example.uee_recipe_management.application.category.model;

import android.os.Parcel;
import android.os.Parcelable;

public class CategoryItem  implements Parcelable {
    /**
     * Model class for the nested recycle view adapter.
     * **/
    private String name;
    private Integer image;
    private String description;

    public CategoryItem(String name, int image, String description) {
        this.name = name;
        this.image = image;
        this.description = description;
    }

    protected CategoryItem(Parcel in) {
        name = in.readString();
        if (in.readByte() == 0) {
            image = null;
        } else {
            image = in.readInt();
        }
        description = in.readString();
    }

    public static final Creator<CategoryItem> CREATOR = new Creator<CategoryItem>() {
        @Override
        public CategoryItem createFromParcel(Parcel in) {
            return new CategoryItem(in);
        }

        @Override
        public CategoryItem[] newArray(int size) {
            return new CategoryItem[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        if (image == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(image);
        }
        parcel.writeString(description);
    }
}
