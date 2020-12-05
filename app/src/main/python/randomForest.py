import pandas as pd
import numpy as np
from sklearn.preprocessing import StandardScaler
from sklearn.ensemble import RandomForestClassifier
from os.path import dirname, join

def random_forest(input):
    # coba nanti pathnya diganti '../res/raw/diabetes_data_upload.csv', kalo masih gabisa coba ditambah os yang add path
    filename = join(dirname(__file__), 'diabetes_data_upload.csv')
    dataset = pd.read_csv(filename)
    data = dataset.replace({'Yes': 1, 'No': 0, 'Male': 1, 'Female': 0, 'Positive': 1, 'Negative': 0})

    input1 = [input]

    x_train = data.iloc[0:500, 0:16].values
    y_train = data.iloc[0:500, 16].values

    sc = StandardScaler()
    x_train = sc.fit_transform(x_train)
    x_test = sc.transform(input1)

    for i in range(1, 5):
        rc = RandomForestClassifier(n_estimators=i, criterion='entropy', random_state=0)
        rc.fit(x_train, y_train)

    y_pred = rc.predict(x_test)
    hasil = ""
    if y_pred[0] == 1:
        hasil = "Positive"
    elif y_pred[0] == 0:
        hasil = "Negative"
    return hasil

# ini script buat ngejalanin, x_test harus bentuknya 2D jadi kurungnya ada 2
#x_test = [[66,  1,  1,  0,  1,  0,  0,  1,  0,  1,  1,  0,  0,  0,  1,  0]]
#print(random_forest(x_test))
