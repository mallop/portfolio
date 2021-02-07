I=imread('finger.png');
%poprawa kontrastu
I=imadjust(I,[],[0.0, 1.0]);
figure;
imshow(I); 


%wyrównanie histogramu
J=rgb2gray(I);
K=histeq(J);
figure;
imshow(K);

%K=rgb2gray(K);
L = ordfilt2(K,81,true(9));
 figure; imshow(L);




%binaryzacja
L=im2bw(K);
 figure;
imshow(L);
 
%odchudzenie krawêdzi
se = strel('line',8,70);
P = imdilate(L,se);
figure; imshow(P); 




